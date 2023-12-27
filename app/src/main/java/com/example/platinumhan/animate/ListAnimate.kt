package com.example.platinumhan.animate

import android.view.animation.AccelerateInterpolator
import androidx.recyclerview.widget.RecyclerView

class ListAnimate: RecyclerView.ItemAnimator() {
    override fun animateDisappearance(
        viewHolder: RecyclerView.ViewHolder,
        preLayoutInfo: ItemHolderInfo,
        postLayoutInfo: ItemHolderInfo?
    ): Boolean {
        return false
    }

    override fun animateAppearance(
        viewHolder: RecyclerView.ViewHolder,
        preLayoutInfo: ItemHolderInfo?,
        postLayoutInfo: ItemHolderInfo
    ): Boolean {
        viewHolder.itemView.x = -50f
        viewHolder.itemView.alpha = 0f
        viewHolder.itemView.animate()
            .alpha(1f)
            .x(0f)
            .setInterpolator(AccelerateInterpolator())
            .duration = 300L
        dispatchAnimationStarted(viewHolder)
        return true
    }

    override fun animatePersistence(
        viewHolder: RecyclerView.ViewHolder,
        preLayoutInfo: ItemHolderInfo,
        postLayoutInfo: ItemHolderInfo
    ): Boolean {
        return false
    }

    override fun animateChange(
        oldHolder: RecyclerView.ViewHolder,
        newHolder: RecyclerView.ViewHolder,
        preLayoutInfo: ItemHolderInfo,
        postLayoutInfo: ItemHolderInfo
    ): Boolean {
        return false
    }

    override fun runPendingAnimations() {

    }

    override fun endAnimation(item: RecyclerView.ViewHolder) {

    }

    override fun endAnimations() {

    }

    override fun isRunning(): Boolean {
        return false
    }

}