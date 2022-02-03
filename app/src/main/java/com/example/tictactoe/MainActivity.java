package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tictactoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int c=1;
    int [][] p={{2,2,2},{2,2,2},{2,2,2}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.one.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[0][0]=1;
                    } else {
                        binding.one.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[0][0]=0;
                    }
                    c++;
                    status();
                }
            }
        });
        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.two.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[0][1]=1;
                    } else {
                        binding.two.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[0][1]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.three.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[0][2]=1;
                    } else {
                        binding.three.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[0][2]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.four.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[1][0]=1;
                    } else {
                        binding.four.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[1][0]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.five.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[1][1]=1;
                    } else {
                        binding.five.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[1][1]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.six.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[1][2]=1;
                    } else {
                        binding.six.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[1][2]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.seven.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[2][0]=1;
                    } else {
                        binding.seven.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[2][0]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.eight.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[2][1]=1;
                    } else {
                        binding.eight.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[2][1]=0;
                    }
                    c++;
                    status();

                }
            }
        });
        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c<10)
                {
                    if (c % 2 == 0) {
                        binding.nine.setImageResource(R.drawable.img_2);
                        binding.turn.setText("X's Turn");
                        p[2][2]=1;
                    }
                    else {
                        binding.nine.setImageResource(R.drawable.img);
                        binding.turn.setText("O's turn");
                        p[2][2]=0;
                    }
                    c++;
                    status();

                }
            }
        });
    }
    public void status()
    {
               if((p[0][0]==0 && p[0][1]==0 && p[0][2]==0)
                ||(p[1][0]==0 && p[1][1]==0 && p[1][2]==0)
                ||(p[2][0]==0 && p[2][1]==0 && p[2][2]==0)
                ||(p[0][0]==0 && p[1][0]==0 && p[2][0]==0)
                ||(p[0][1]==0 && p[1][1]==0 && p[2][1]==0)
                ||(p[0][2]==0 && p[1][2]==0 && p[2][2]==0)
                ||(p[0][2]==0 && p[1][1]==0 && p[2][0]==0)
                ||(p[0][0]==0 && p[1][1]==0 && p[2][2]==0) )
               {
                   binding.turn.setText("Game Over..!");
                   binding.status.setText("X has Won");
                   c=50;
               }
               else if((p[0][0]==1 && p[0][1]==1 && p[0][2]==1)||(p[1][0]==1 && p[1][1]==1 && p[1][2]==1)
                       ||(p[2][0]==1 && p[2][1]==1 && p[2][2]==1)||(p[0][0]==1 && p[1][0]==1 && p[2][0]==1)
                       ||(p[0][1]==1 && p[1][1]==1 && p[2][1]==1)||(p[0][2]==1 && p[1][2]==1 && p[2][2]==1)
                       ||(p[0][2]==1 && p[1][1]==1 && p[2][0]==1)||(p[0][0]==1 && p[1][1]==1 && p[2][2]==1))
               {
                   binding.turn.setText("Game Over..!");
                   binding.status.setText("O has Won");
                   c=50;
               }
               else
               {
                   if(c>9)
                   {
                       binding.turn.setText("Game Over..!");
                       binding.status.setText("It's a tie Match");
                       c=50;
                   }
               }
    }
}