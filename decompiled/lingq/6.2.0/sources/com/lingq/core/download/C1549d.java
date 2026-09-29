package com.lingq.core.download;

import android.content.Context;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.download.downloader.C1550a;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.do7;
import p000.du0;
import p000.eh9;
import p000.mb1;
import p000.ob1;
import p000.si7;
import p000.tj2;
import p000.un1;
import p000.va3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.download.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1549d implements va3 {

    /* JADX INFO: renamed from: a */
    public final si7 f20224a;

    /* JADX INFO: renamed from: b */
    public final C1550a f20225b;

    /* JADX INFO: renamed from: c */
    public String f20226c;

    /* JADX INFO: renamed from: d */
    public final File f20227d;

    /* JADX INFO: renamed from: e */
    public final C3211a f20228e;

    /* JADX INFO: renamed from: f */
    public final du0 f20229f;

    /* JADX INFO: renamed from: g */
    public final C3244l f20230g;

    /* JADX INFO: renamed from: h */
    public final c18 f20231h;

    public C1549d(Context context, un1 un1Var, si7 si7Var, C1550a c1550a) {
        un1Var.getClass();
        si7Var.getClass();
        c1550a.getClass();
        this.f20224a = si7Var;
        this.f20225b = c1550a;
        ob1.Companion.getClass();
        this.f20227d = mb1.m16741a(context);
        C3211a c3211aM10525a = do7.m10525a(1, 4, BufferOverflow.SUSPEND);
        this.f20228e = c3211aM10525a;
        this.f20229f = AbstractC3224d.m15519A(c3211aM10525a);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(tj2.f62365a);
        this.f20230g = c3244lM17114d;
        this.f20231h = AbstractC3224d.m15524c(c3244lM17114d);
        wfb.m23926u(un1Var, null, null, new FontDownloadManagerImpl$1(this, null), 3);
    }

    @Override // p000.va3
    /* JADX INFO: renamed from: I0 */
    public final eh9 mo8236I0() {
        return this.f20231h;
    }

    @Override // p000.va3
    /* JADX INFO: renamed from: v1 */
    public final Object mo8237v1(ReaderFont readerFont, ContinuationImpl continuationImpl) {
        Object objMo4678m = this.f20228e.mo4678m(readerFont, continuationImpl);
        return objMo4678m == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo4678m : xfa.f68157a;
    }
}
