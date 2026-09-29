package com.lingq.p055ui.home.playlist;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.playlist.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3961a implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlaylistAdapter.AbstractC3888a f25938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List<String> f25939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PlaylistAdapter f25940c;

    public C3961a(PlaylistAdapter.AbstractC3888a abstractC3888a, ArrayList arrayList, PlaylistAdapter playlistAdapter) {
        this.f25938a = abstractC3888a;
        this.f25939b = arrayList;
        this.f25940c = playlistAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        CoursePlaylistSort coursePlaylistSort = null;
        View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            Context context = this.f25938a.f7054a.getContext();
            C5207g.m11110e(context, "holder.itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
        }
        for (CoursePlaylistSort coursePlaylistSort2 : CoursePlaylistSort.values()) {
            if (C5207g.m11106a(coursePlaylistSort2.name(), this.f25939b.get(i10))) {
                coursePlaylistSort = coursePlaylistSort2;
                break;
            }
        }
        if (coursePlaylistSort != null) {
            this.f25940c.f25399f.mo9876b(coursePlaylistSort);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
