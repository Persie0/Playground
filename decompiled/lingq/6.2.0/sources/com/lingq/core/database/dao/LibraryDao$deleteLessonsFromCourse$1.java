package com.lingq.core.database.dao;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LibraryDao", m4291f = "LibraryDao.kt", m4292l = {300, 301}, m4293m = "deleteLessonsFromCourse$suspendImpl", m4294v = 2)
final class LibraryDao$deleteLessonsFromCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1321i f16970a;

    /* JADX INFO: renamed from: b */
    public List f16971b;

    /* JADX INFO: renamed from: c */
    public int f16972c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16973d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1321i f16974e;

    /* JADX INFO: renamed from: f */
    public int f16975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryDao$deleteLessonsFromCourse$1(C1321i c1321i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16974e = c1321i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16973d = obj;
        this.f16975f |= Integer.MIN_VALUE;
        return C1321i.m7503z0(this.f16974e, 0, null, this);
    }
}
