package com.example.inputfilterlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et = (EditText) findViewById(R.id.editText);
        et.setFilters(new InputFilter[]{new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Log.i("bear", "source: " + source);
                Log.i("bear", "start: " + start);
                Log.i("bear", "end: " + end);
                Log.i("bear", "dest: " + dest);
                Log.i("bear", "dstart: " + dstart);
                Log.i("bear", "dend: " + dend);

                /*
                 *
                 *  12-18 14:10:15.222 26052-26052/com.example.inputfilterlearn I/bear: source: d
                    12-18 14:10:15.223 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:10:15.223 26052-26052/com.example.inputfilterlearn I/bear: end: 1
                    12-18 14:10:15.223 26052-26052/com.example.inputfilterlearn I/bear: dest:
                    12-18 14:10:15.223 26052-26052/com.example.inputfilterlearn I/bear: dstart: 0
                    12-18 14:10:15.223 26052-26052/com.example.inputfilterlearn I/bear: dend: 0

                    12-18 14:10:35.765 26052-26052/com.example.inputfilterlearn I/bear: source: e
                    12-18 14:10:35.765 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:10:35.765 26052-26052/com.example.inputfilterlearn I/bear: end: 1
                    12-18 14:10:35.765 26052-26052/com.example.inputfilterlearn I/bear: dest: d
                    12-18 14:10:35.765 26052-26052/com.example.inputfilterlearn I/bear: dstart: 1
                    12-18 14:10:35.765 26052-26052/com.example.inputfilterlearn I/bear: dend: 1

                    12-18 14:10:36.124 26052-26052/com.example.inputfilterlearn I/bear: source: a
                    12-18 14:10:36.124 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:10:36.124 26052-26052/com.example.inputfilterlearn I/bear: end: 1
                    12-18 14:10:36.124 26052-26052/com.example.inputfilterlearn I/bear: dest: de
                    12-18 14:10:36.124 26052-26052/com.example.inputfilterlearn I/bear: dstart: 2
                    12-18 14:10:36.124 26052-26052/com.example.inputfilterlearn I/bear: dend: 2

                    12-18 14:10:36.400 26052-26052/com.example.inputfilterlearn I/bear: source: r
                    12-18 14:10:36.400 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:10:36.400 26052-26052/com.example.inputfilterlearn I/bear: end: 1
                    12-18 14:10:36.400 26052-26052/com.example.inputfilterlearn I/bear: dest: dea
                    12-18 14:10:36.400 26052-26052/com.example.inputfilterlearn I/bear: dstart: 3
                    12-18 14:10:36.400 26052-26052/com.example.inputfilterlearn I/bear: dend: 3

                    12-18 14:11:08.280 26052-26052/com.example.inputfilterlearn I/bear: source: s
                    12-18 14:11:08.280 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:11:08.280 26052-26052/com.example.inputfilterlearn I/bear: end: 1
                    12-18 14:11:08.280 26052-26052/com.example.inputfilterlearn I/bear: dest: dear
                    12-18 14:11:08.280 26052-26052/com.example.inputfilterlearn I/bear: dstart: 3
                    12-18 14:11:08.280 26052-26052/com.example.inputfilterlearn I/bear: dend: 3

                    12-18 14:11:37.063 26052-26052/com.example.inputfilterlearn I/bear: source: 我是
                    12-18 14:11:37.063 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:11:37.063 26052-26052/com.example.inputfilterlearn I/bear: end: 2
                    12-18 14:11:37.063 26052-26052/com.example.inputfilterlearn I/bear: dest: deasr
                    12-18 14:11:37.063 26052-26052/com.example.inputfilterlearn I/bear: dstart: 5
                    12-18 14:11:37.063 26052-26052/com.example.inputfilterlearn I/bear: dend: 5

                    12-18 14:11:48.701 26052-26052/com.example.inputfilterlearn I/bear: source: 小熊
                    12-18 14:11:48.701 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:11:48.701 26052-26052/com.example.inputfilterlearn I/bear: end: 2
                    12-18 14:11:48.701 26052-26052/com.example.inputfilterlearn I/bear: dest: deasr我是
                    12-18 14:11:48.701 26052-26052/com.example.inputfilterlearn I/bear: dstart: 2
                    12-18 14:11:48.701 26052-26052/com.example.inputfilterlearn I/bear: dend: 2

                    //粘贴的情形
                    12-18 14:19:13.921 26052-26052/com.example.inputfilterlearn I/bear: source: 小熊asr
                    12-18 14:19:13.921 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:19:13.921 26052-26052/com.example.inputfilterlearn I/bear: end: 5
                    12-18 14:19:13.921 26052-26052/com.example.inputfilterlearn I/bear: dest: de我是
                    12-18 14:19:13.921 26052-26052/com.example.inputfilterlearn I/bear: dstart: 4
                    12-18 14:19:13.921 26052-26052/com.example.inputfilterlearn I/bear: dend: 4

                    //剪切文字的情形
                    12-18 14:18:36.978 26052-26052/com.example.inputfilterlearn I/bear: source:
                    12-18 14:18:36.978 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:18:36.978 26052-26052/com.example.inputfilterlearn I/bear: end: 0
                    12-18 14:18:36.978 26052-26052/com.example.inputfilterlearn I/bear: dest: de小熊asr我是
                    12-18 14:18:36.978 26052-26052/com.example.inputfilterlearn I/bear: dstart: 2
                    12-18 14:18:36.978 26052-26052/com.example.inputfilterlearn I/bear: dend: 7

                    //删除的情形
                    12-18 14:19:52.791 26052-26052/com.example.inputfilterlearn I/bear: source:
                    12-18 14:19:52.791 26052-26052/com.example.inputfilterlearn I/bear: start: 0
                    12-18 14:19:52.791 26052-26052/com.example.inputfilterlearn I/bear: end: 0
                    12-18 14:19:52.791 26052-26052/com.example.inputfilterlearn I/bear: dest: de我是小熊asr
                    12-18 14:19:52.791 26052-26052/com.example.inputfilterlearn I/bear: dstart: 8
                    12-18 14:19:52.791 26052-26052/com.example.inputfilterlearn I/bear: dend: 9

                    以上为测试filter()方法的参数：
                    CharSequence source,
                    int start,
                    int end,
                    Spanned dest,
                    int dstart,
                    int dend,
                    打印的log

                    //增加文字的时候：
                    source是本次输入法返回给界面的内容。
                    start一般都是0，感觉只有在输入法输入"胖熊战士"但传给界面的是"熊战"时，start才会不同。瞎猜的。
                    end一般都是source的字符总长度，特殊情况可能与start相同。
                    dest是本次输入发生前，控件上已经展示的文字。
                    dstart是当前输入的文字将要插入到dest的位置。
                    dend与dstart相同。

                    //减少文字的时候：
                    source是空
                    start是0
                    end是0
                    dest是本次将要删除的内容
                    dstart：本次将要删除的内容在dest中的起始位置
                    dend：本次将要删除的内容在dest中的终止位置（不含此位置）


                 */

                return null;
            }
        }});


    }
}
