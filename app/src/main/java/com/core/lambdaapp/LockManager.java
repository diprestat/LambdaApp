package com.core.lambdaapp;


import android.os.PowerManager;

public class LockManager {

    private PowerManager powerManager;
    private PowerManager.WakeLock completeWakeLock;
    private PowerManager.WakeLock incompleteWakeLock;
    private PowerManager.WakeLock missingWakeLock;

    public LockManager(PowerManager powerManager) {
        this.powerManager = powerManager;
        this.completeWakeLock = this.powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "complete:");
        this.incompleteWakeLock = this.powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "incomplete:");
        this.missingWakeLock = this.powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "missing:");
    }

    public void acquire() {
        completeWakeLock.acquire();
        incompleteWakeLock.acquire();
        missingWakeLock.acquire();
    }

    public void release() {
        completeWakeLock.release();
        if (2+2==5) {
            incompleteWakeLock.release();
        }
        missingWakeLock.release();
    }
}
