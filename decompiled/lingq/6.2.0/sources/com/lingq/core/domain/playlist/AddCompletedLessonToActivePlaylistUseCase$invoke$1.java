package com.lingq.core.domain.playlist;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.AddCompletedLessonToActivePlaylistUseCase", m4291f = "AddCompletedLessonToActivePlaylistUseCase.kt", m4292l = {18, 20, 21, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 26, 30}, m4293m = "invoke", m4294v = 2)
final class AddCompletedLessonToActivePlaylistUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f19882a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f19883b;

    /* JADX INFO: renamed from: c */
    public Object f19884c;

    /* JADX INFO: renamed from: d */
    public int f19885d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19886e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1518a f19887f;

    /* JADX INFO: renamed from: g */
    public int f19888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCompletedLessonToActivePlaylistUseCase$invoke$1(C1518a c1518a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19887f = c1518a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19886e = obj;
        this.f19888g |= Integer.MIN_VALUE;
        return this.f19887f.m8194a(0, null, this);
    }
}
