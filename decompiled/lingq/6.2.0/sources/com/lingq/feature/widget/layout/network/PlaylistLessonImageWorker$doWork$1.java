package com.lingq.feature.widget.layout.network;

import android.net.Uri;
import androidx.datastore.preferences.core.Preferences;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ln3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.widget.layout.network.PlaylistLessonImageWorker", m4291f = "PlaylistLessonImageWorker.kt", m4292l = {57, 81, 86, 92}, m4293m = "doWork", m4294v = 2)
final class PlaylistLessonImageWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f33845a;

    /* JADX INFO: renamed from: b */
    public int f33846b;

    /* JADX INFO: renamed from: c */
    public int f33847c;

    /* JADX INFO: renamed from: d */
    public int f33848d;

    /* JADX INFO: renamed from: e */
    public Uri f33849e;

    /* JADX INFO: renamed from: f */
    public Preferences.Key f33850f;

    /* JADX INFO: renamed from: g */
    public Iterator f33851g;

    /* JADX INFO: renamed from: h */
    public ln3 f33852h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f33853i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistLessonImageWorker f33854j;

    /* JADX INFO: renamed from: k */
    public int f33855k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLessonImageWorker$doWork$1(PlaylistLessonImageWorker playlistLessonImageWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33854j = playlistLessonImageWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33853i = obj;
        this.f33855k |= Integer.MIN_VALUE;
        return this.f33854j.mo2213d(this);
    }
}
