package com.kmp.expectactual
import UIKit

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice().batteryMonitoringEnabled = true
        val batteryLevel = UIDevice.currentDevice().batteryLevel
        return (batteryLevel * 100).toInt()
    }
}