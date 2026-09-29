package com.lingq.feature.playlist;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.l55;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$downloadAll$1", m4291f = "PlaylistViewModel.kt", m4292l = {796, 816, 824, 830}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$downloadAll$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C2255e f27669a;

    /* JADX INFO: renamed from: b */
    public Iterator f27670b;

    /* JADX INFO: renamed from: c */
    public l55 f27671c;

    /* JADX INFO: renamed from: d */
    public int f27672d;

    /* JADX INFO: renamed from: e */
    public int f27673e;

    /* JADX INFO: renamed from: f */
    public int f27674f;

    /* JADX INFO: renamed from: g */
    public int f27675g;

    /* JADX INFO: renamed from: h */
    public int f27676h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2255e f27677i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$downloadAll$1(C2255e c2255e, Continuation continuation) {
        super(1, continuation);
        this.f27677i = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$downloadAll$1(this.f27677i, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$downloadAll$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0100 -> B:69:0x0182). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0106 -> B:69:0x0182). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x010c -> B:69:0x0182). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x017c -> B:68:0x017f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.playlist.PlaylistViewModel$downloadAll$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
