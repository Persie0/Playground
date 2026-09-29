package p512yi;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import dm.C5207g;

/* JADX INFO: renamed from: yi.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC10373c implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CollectionsAdapter f52134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CollectionsAdapter.AbstractC3739a.e f52135c;

    public /* synthetic */ ViewOnClickListenerC10373c(CollectionsAdapter.AbstractC3739a.e eVar, CollectionsAdapter collectionsAdapter) {
        this.f52133a = 2;
        this.f52135c = eVar;
        this.f52134b = collectionsAdapter;
    }

    public /* synthetic */ ViewOnClickListenerC10373c(CollectionsAdapter collectionsAdapter, CollectionsAdapter.AbstractC3739a.e eVar, int i10) {
        this.f52133a = i10;
        this.f52134b = collectionsAdapter;
        this.f52135c = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10 = this.f52133a;
        CollectionsAdapter.AbstractC3739a.e eVar = this.f52135c;
        CollectionsAdapter collectionsAdapter = this.f52134b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(eVar, "$item");
                collectionsAdapter.f24478f.mo9822v(!eVar.f24488a.f24528g);
                break;
            case 1:
                C5207g.m11111f(collectionsAdapter, "this$0");
                C5207g.m11111f(eVar, "$item");
                collectionsAdapter.f24478f.mo9810j(eVar.f24488a.f24522a);
                break;
            default:
                C5207g.m11111f(eVar, "$item");
                C5207g.m11111f(collectionsAdapter, "this$0");
                LessonMediaSource lessonMediaSource = eVar.f24488a.f24522a.f36612r;
                if (lessonMediaSource != null && (str = lessonMediaSource.f22001c) != null) {
                    collectionsAdapter.f24478f.mo9817q(str);
                    break;
                }
                break;
        }
    }
}
