package com.lingq.feature.playlist;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.c32;
import p000.l55;
import p000.ldd;
import p000.mb1;
import p000.ob1;
import p000.q2c;
import p000.sc9;
import p000.t66;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.ye7;
import p000.ze7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistScreenKt$PlaylistScreen$2$1", m4291f = "PlaylistScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistScreenKt$PlaylistScreen$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ze7 f27607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f27608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f27609c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sc9 f27610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScreenKt$PlaylistScreen$2$1(ze7 ze7Var, Context context, t66 t66Var, sc9 sc9Var, Continuation continuation) {
        super(2, continuation);
        this.f27607a = ze7Var;
        this.f27608b = context;
        this.f27609c = t66Var;
        this.f27610d = sc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistScreenKt$PlaylistScreen$2$1(this.f27607a, this.f27608b, this.f27609c, this.f27610d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlaylistScreenKt$PlaylistScreen$2$1 playlistScreenKt$PlaylistScreen$2$1 = (PlaylistScreenKt$PlaylistScreen$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playlistScreenKt$PlaylistScreen$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (((Boolean) this.f27609c.getValue()).booleanValue()) {
            ze7 ze7Var = this.f27607a;
            if (ze7Var instanceof ye7) {
                ArrayList arrayListM19624a = q2c.m19624a(((ye7) ze7Var).f69743n);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM19624a) {
                    if (!((l55) obj2).f49081a.f63782p) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(((l55) it.next()).f49081a.f63767a, arrayList2);
                }
                ob1.Companion.getClass();
                ArrayList arrayListM16141a = ldd.m16141a(mb1.m16743c(this.f27608b));
                if (arrayListM16141a != null) {
                    ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((Number) it2.next()).intValue() + ".mp3");
                    }
                    HashSet hashSetM22620l1 = u91.m22620l1(arrayList3);
                    Iterator it3 = arrayListM16141a.iterator();
                    it3.getClass();
                    long length = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        next.getClass();
                        File file = (File) next;
                        if (hashSetM22620l1.contains(file.getName())) {
                            length += file.length();
                        }
                    }
                    i = (int) ((length / 1024) / 1024);
                } else {
                    i = 0;
                }
                this.f27610d.m21223i(i);
            }
        }
        return xfa.f68157a;
    }
}
