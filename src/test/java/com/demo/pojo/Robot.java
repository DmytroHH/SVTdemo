package com.demo.pojo;

public class Robot {

        private int robotId;
        private int batteryLevel;
        private int y;
        private int x;

        @Override
        public String toString() {
            return "Robot{" +
                    "robotId=" + robotId +
                    ", batteryLevel=" + batteryLevel +
                    ", y=" + y +
                    ", x=" + x +
                    '}';
        }
        public Robot(){

        }

        public Robot(int id, int batteryLevel, int y, int x) {
            this.robotId = id;
            this.batteryLevel = batteryLevel;
            this.y = y;
            this.x = x;
        }

        public int getId() {
            return robotId;
        }

        public void setRobotId(int robotId) {
            this.robotId = robotId;
        }

        public int getBatteryLevel() {
            return batteryLevel;
        }

        public void setBatteryLevel(int batteryLevel) {
            this.batteryLevel = batteryLevel;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }


}
