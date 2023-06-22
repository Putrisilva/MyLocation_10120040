/**
 * Nim      : 10120040
 * Nama     : Putri Silva Amrillah
 * Kelas    : IF-1
 * Email    : putri.10120040@mahasiswa.unikom.ac.id
 */

package com.putri10120040.mylocation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new Map_Fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }
}