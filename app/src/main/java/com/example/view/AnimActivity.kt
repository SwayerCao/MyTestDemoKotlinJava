package com.example.view

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R

class AnimActivity : AppCompatActivity(),View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anim)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.llAddAccount ->
            {
                //相应api工厂类生成动画
//                val objectAnimation = ObjectAnimator.ofFloat(v, "scaleX", 0f, -1f)
//                objectAnimation.start()
                //xml动画
//                val objectAnimation = AnimatorInflater.loadAnimator(this,R.animator.animator_translation)
//                objectAnimation.setTarget(v)
//                objectAnimation.start()

//                val objectAnimation =ObjectAnimator.ofFloat(v, "alpha", 1f,0f,1f)
//                objectAnimation.duration=3000
//                objectAnimation.start()
                //缩放
//                val objectAnimation =ObjectAnimator.ofFloat(v, "scaleX", 0f,2f)
//                objectAnimation.duration=3000
//                objectAnimation.repeatCount=2
//                objectAnimation.repeatMode= ValueAnimator.REVERSE
//                objectAnimation.start()
                //旋转
//                val objectAnimation =
//                    ObjectAnimator.ofFloat(v, "rotation", 0f,360f,0f)
//                objectAnimation.duration=600
//                objectAnimation.repeatCount = 10
//                objectAnimation.repeatMode=ValueAnimator.RESTART
//                objectAnimation.start()

                //动画连续播放
//                val aAnimator=ObjectAnimator.ofInt(1)
//                val bAnimator=ObjectAnimator.ofInt(1)
//                val cAnimator=ObjectAnimator.ofInt(1)
//                val dAnimator=ObjectAnimator.ofInt(1)
//
//                AnimatorSet().apply {
//                    play(aAnimator).before(bAnimator)//a 在b之前播放
//                    play(bAnimator).with(cAnimator)//b和c同时播放动画效果
//                    play(dAnimator).after(cAnimator)//d 在c播放结束之后播放
//                    start()
//                }
//
//                AnimatorSet().apply {
//                    playSequentially(aAnimator,bAnimator,cAnimator,dAnimator)//顺序
//                    playTogether(aAnimator,bAnimator,cAnimator,dAnimator) //同时播放
//                    start()
//                }

                ObjectAnimator.ofFloat(v, "translationX", 0f, 780f, 0f).apply {
                    duration=3000//完成动画所需要时间
                    repeatCount=ValueAnimator.INFINITE  //重复次数：无限循环
                    repeatMode=ValueAnimator.RESTART    //重复模式：重头开始
                    addUpdateListener { //监听值变化
                        v.translationX= it.animatedValue as Float
                    }
                    addListener(object: Animator.AnimatorListener{
                        override fun onAnimationRepeat(animation: Animator?) {
                            //动画重复
                        }

                        override fun onAnimationEnd(animation: Animator?) {
                            //动画结束
                        }

                        override fun onAnimationCancel(animation: Animator?) {
                            //动画取消
                        }

                        override fun onAnimationStart(animation: Animator?) {
                            //动画开始
                        }
                    })
                }


            }
        }
    }
}