package com.example.bhopalcoderscommunity;


        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;

public class SubmitAdapter extends RecyclerView.Adapter<SubmitAdapter.SubmitViewHolder> {

    ArrayList<Submit> submit;
    Context context;

    public SubmitAdapter(Context context, ArrayList<Submit> subList) {

        submit = subList;
        this.context = context;
        //Submit s= new Submit("shraman","oriental","jainshraman1998@gmail.com",21,"male","2","8989660065","writing","python","app development","link","fb","res","git","why","expe","pref","sug");
//submit.add(s);


    }

    class SubmitViewHolder extends RecyclerView.ViewHolder {

        TextView name, mobile, email, gender, age, college, year, area, tech, working, link, fb, git, resume, why,exep, share, any, ref;


        public SubmitViewHolder(@NonNull View itemView) {
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
            exep=(TextView)itemView.findViewById(R.id.expET);
            share = (TextView) itemView.findViewById(R.id.sugET);
            ref = (TextView) itemView.findViewById(R.id.perET);

        }
    }


    @NonNull
    @Override
    public SubmitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inputfile,parent,false);
        return new SubmitViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SubmitViewHolder holder, int position) {

        Submit s = submit.get(position);
        holder.name.setText(s.name+""+s.age);
       // holder.age.setText(s.age);
        holder.college.setText(s.college);
        holder.email.setText(s.email);
        holder.gender.setText(s.gen);
        holder.year.setText(s.yos);
        holder.mobile.setText(s.mob);
        holder.area.setText(s.area);
        holder.tech.setText(s.tech);
        holder.working.setText(s.spez);
        holder.link.setText(s.link);
        holder.fb.setText(s.fb);
        holder.resume.setText(s.res);
        holder.git.setText(s.git);

        holder.why.setText(s.why+""+s.expe);
        //holder.exep.setText(s.expe);
        holder.ref.setText(s.pref);
        holder.share.setText(s.suug);



    }

    @Override
    public int getItemCount() {
        return submit.size();
    }
}
