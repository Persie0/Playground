package com.lingq.feature.playlist;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.l55;
import p000.ldd;
import p000.mb1;
import p000.nc7;
import p000.ob1;
import p000.q2c;
import p000.t66;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vi3;
import p000.xfa;
import p000.ye7;
import p000.ze7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistScreenKt$PlaylistScreen$1$1", m4291f = "PlaylistScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistScreenKt$PlaylistScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ze7 f27597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f27598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f27599c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f27600d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f27601e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f27602f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f27603g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f27604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScreenKt$PlaylistScreen$1$1(ze7 ze7Var, Context context, vi3 vi3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5, Continuation continuation) {
        super(2, continuation);
        this.f27597a = ze7Var;
        this.f27598b = context;
        this.f27599c = vi3Var;
        this.f27600d = t66Var;
        this.f27601e = t66Var2;
        this.f27602f = t66Var3;
        this.f27603g = t66Var4;
        this.f27604h = t66Var5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistScreenKt$PlaylistScreen$1$1(this.f27597a, this.f27598b, this.f27599c, this.f27600d, this.f27601e, this.f27602f, this.f27603g, this.f27604h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlaylistScreenKt$PlaylistScreen$1$1 playlistScreenKt$PlaylistScreen$1$1 = (PlaylistScreenKt$PlaylistScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playlistScreenKt$PlaylistScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ze7 ze7Var = this.f27597a;
        if (ze7Var instanceof ye7) {
            ye7 ye7Var = (ye7) ze7Var;
            List list = ye7Var.f69743n;
            this.f27600d.setValue(Boolean.valueOf(ye7Var.f69730a));
            this.f27601e.setValue(Boolean.valueOf(ye7Var.f69731b));
            this.f27602f.setValue(Boolean.valueOf(ye7Var.f69742m.f42179g));
            this.f27603g.setValue(Boolean.valueOf(ye7Var.f69732c));
            this.f27604h.setValue(Boolean.valueOf(q2c.m19624a(list).size() > 1));
            if (ye7Var.f69733d) {
                ArrayList arrayListM19624a = q2c.m19624a(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM19624a) {
                    if (!((l55) obj2).f49081a.f63782p) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((l55) it.next()).f49081a.f63767a + ".mp3");
                }
                HashSet hashSetM22620l1 = u91.m22620l1(arrayList2);
                Context context = this.f27598b;
                context.getClass();
                ob1.Companion.getClass();
                ArrayList arrayListM16141a = ldd.m16141a(mb1.m16743c(context));
                if (arrayListM16141a != null) {
                    Iterator it2 = arrayListM16141a.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        next.getClass();
                        File file = (File) next;
                        if (hashSetM22620l1.contains(file.getName()) && file.exists()) {
                            file.delete();
                        }
                    }
                }
                this.f27599c.invoke(nc7.f52597a);
            }
        }
        return xfa.f68157a;
    }
}
