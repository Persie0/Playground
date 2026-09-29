package com.lingq.feature.reader.progress;

import com.lingq.feature.reader.progress.domain.C2471a;
import com.lingq.feature.reader.progress.domain.C2472b;
import java.util.List;
import p000.un1;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.reader.progress.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2470a {

    /* JADX INFO: renamed from: a */
    public final C2472b f29863a;

    /* JADX INFO: renamed from: b */
    public final C2471a f29864b;

    /* JADX INFO: renamed from: c */
    public final un1 f29865c;

    /* JADX INFO: renamed from: d */
    public final un1 f29866d;

    public C2470a(C2472b c2472b, C2471a c2471a, un1 un1Var, un1 un1Var2) {
        un1Var.getClass();
        un1Var2.getClass();
        this.f29863a = c2472b;
        this.f29864b = c2471a;
        this.f29865c = un1Var;
        this.f29866d = un1Var2;
    }

    /* JADX INFO: renamed from: a */
    public final void m9373a(int i, String str, List list) {
        str.getClass();
        wfb.m23926u(this.f29865c, null, null, new ReaderProgressManager$completeLesson$1(this, str, i, list, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9374b(boolean z, String str, int i, int i2, int i3, List list) {
        str.getClass();
        list.getClass();
        if (z && i3 > i2 && i2 >= 0 && i2 < list.size()) {
            wfb.m23926u(this.f29866d, null, null, new ReaderProgressManager$movePreviousPageToKnownIfNeeded$1(this, str, i, list, i2, null), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9375c(boolean z, String str, int i, int i2, int i3, List list) {
        str.getClass();
        list.getClass();
        if (z && i3 > i2 && i2 >= 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            int size = list.size();
            if (i3 > size) {
                i3 = size;
            }
            List listSubList = list.subList(i2, i3);
            if (listSubList.isEmpty()) {
                return;
            }
            wfb.m23926u(this.f29866d, null, null, new ReaderProgressManager$moveSkippedPagesToKnownIfNeeded$1(this, str, i, listSubList, null), 3);
        }
    }
}
