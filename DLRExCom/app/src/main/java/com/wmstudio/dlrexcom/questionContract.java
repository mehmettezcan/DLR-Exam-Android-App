package com.wmstudio.dlrexcom;

import android.provider.BaseColumns;

public final class questionContract {
    private questionContract(){}

    public static class questionTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COL_QUESTİONS = "questions";
        public static final String COL_DIRECTION = "direction";
        public static final String COL_COLOR = "questions_color";
        public static final String COL_DOT_COUNT = "questions_dot";
        public static final String COL_OPTION1 = "option1";
        public static final String COL_OPTION2 = "option2";
        public static final String COL_OPTION3 = "option3";
    }
}
