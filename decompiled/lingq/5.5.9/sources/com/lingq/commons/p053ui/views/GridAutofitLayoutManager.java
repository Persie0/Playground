package com.lingq.commons.p053ui.views;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/commons/ui/views/GridAutofitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class GridAutofitLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: g0 */
    public final void mo4085g0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        C5207g.m11111f(c1127t, "recycler");
        C5207g.m11111f(c1131x, "state");
        super.mo4085g0(c1127t, c1131x);
    }
}
