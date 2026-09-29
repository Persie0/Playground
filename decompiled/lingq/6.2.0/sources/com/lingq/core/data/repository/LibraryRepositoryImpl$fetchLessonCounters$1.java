package com.lingq.core.data.repository;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {268, 271, 281}, m4293m = "fetchLessonCounters", m4294v = 2)
final class LibraryRepositoryImpl$fetchLessonCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Collection f15731a;

    /* JADX INFO: renamed from: b */
    public Iterator f15732b;

    /* JADX INFO: renamed from: c */
    public Map.Entry f15733c;

    /* JADX INFO: renamed from: d */
    public Collection f15734d;

    /* JADX INFO: renamed from: e */
    public int f15735e;

    /* JADX INFO: renamed from: f */
    public int f15736f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f15737g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1296l f15738h;

    /* JADX INFO: renamed from: i */
    public int f15739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$fetchLessonCounters$1(C1296l c1296l, Continuation continuation) {
        super(continuation);
        this.f15738h = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15737g = obj;
        this.f15739i |= Integer.MIN_VALUE;
        return this.f15738h.m7311f(null, null, this);
    }
}
