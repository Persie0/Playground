package lk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: lk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7385a extends ArrayAdapter<Integer> {

    /* JADX INFO: renamed from: a */
    public final List<String> f41186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7385a(Context context, Integer[] numArr, ArrayList arrayList) {
        super(context, R.layout.view_spinner_text, numArr);
        C5207g.m11111f(numArr, "images");
        this.f41186a = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        C5207g.m11111f(viewGroup, "parent");
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        List<Integer> list = C6716m.f37937a;
        linearLayout.setPadding((int) C6716m.m13316a(10), (int) C6716m.m13316a(5), (int) C6716m.m13316a(10), (int) C6716m.m13316a(5));
        ImageView imageView = new ImageView(getContext());
        Integer item = getItem(i10);
        C5207g.m11108c(item);
        C6716m.m13325j(imageView, item.intValue());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) C6716m.m13316a(24), (int) C6716m.m13316a(24)));
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        textView.setPadding((int) C6716m.m13316a(10), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView.setText(this.f41186a.get(i10));
        linearLayout.addView(textView);
        return linearLayout;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        C5207g.m11111f(viewGroup, "parent");
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        List<Integer> list = C6716m.f37937a;
        linearLayout.setPadding((int) C6716m.m13316a(5), (int) C6716m.m13316a(2), linearLayout.getPaddingRight(), (int) C6716m.m13316a(2));
        ImageView imageView = new ImageView(getContext());
        Integer item = getItem(i10);
        C5207g.m11108c(item);
        C6716m.m13325j(imageView, item.intValue());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) C6716m.m13316a(20), (int) C6716m.m13316a(20)));
        linearLayout.addView(imageView);
        return linearLayout;
    }
}
