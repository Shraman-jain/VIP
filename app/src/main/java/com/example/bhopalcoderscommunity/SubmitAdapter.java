package com.example.bhopalcoderscommunity;

import android.annotation.SuppressLint;
import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;

class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.ResponseViewHolder> {

    ArrayList<Submit> submit;
    Context context;

    public ResponseAdapter(Context context, ArrayList<Submit> respList) {

        submit = respList;
        this.context = context;


    }

    class ResponseViewHolder extends RecyclerView.ViewHolder {

        TextView name, mobile, email, gender, age, college, year, area, tech, working, link, fb, git, resume, why, share, any, ref;

        @SuppressLint("WrongViewCast")
        public ResponseViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameET);
            mobile = (TextView) itemView.findViewById(R.id.mobnoET);
            email = (TextView) itemView.findViewById(R.id.emailET);
            gender = (TextView) itemView.findViewById(R.id.genderRG);
            age = (TextView) itemView.findViewById(R.id.angCB);
            college = (TextView) itemView.findViewById(R.id.collegeET);
            year = (TextView) itemView.findViewById(R.id.yosSP);
            area = (TextView) itemView.findViewById(R.id.area);
            tech = (TextView) itemView.findViewById(R.id.tech);
            working = (TextView) itemView.findViewById(R.id.spez);
            link = (TextView) itemView.findViewById(R.id.ldET);
            fb = (TextView) itemView.findViewById(R.id.fbET);
            git = (TextView) itemView.findViewById(R.id.gitET);
            resume = (TextView) itemView.findViewById(R.id.resumeET);
            why = (TextView) itemView.findViewById(R.id.whyET);
            share = (TextView) itemView.findViewById(R.id.sugET);
            ref = (TextView) itemView.findViewById(R.id.perET);

        }
    }


    @NonNull
    @Override
    public ResponseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inputfile,parent,false);
        return new ResponseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResponseViewHolder holder, int position) {

        Submit i = submit.get(position);
        holder.name.setText(i.name);
        holder.mobile.setText(i.mob);
        holder.email.setText(i.email);
        holder.gender.setText(i.gen);
        holder.age.setText(i.age + "");
        holder.college.setText(i.college);
        holder.year.setText(i.yos);
        holder.area.setText(i.area);
        holder.tech.setText(i.tech);
        holder.working.setText(i.spez);
        holder.link.setText(i.link);
        holder.fb.setText(i.fb);
        holder.git.setText(i.git);
        holder.resume.setText(i.res);
        holder.why.setText(i.why);
        holder.share.setText(i.suug);
        holder.ref.setText(i.pref);


    }

    @Override
    public int getItemCount() {
        return submit.size();
    }
}
