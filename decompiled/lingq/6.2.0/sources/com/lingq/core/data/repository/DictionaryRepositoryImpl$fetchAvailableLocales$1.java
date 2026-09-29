package com.lingq.core.data.repository;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {176, 186, 189}, m4293m = "fetchAvailableLocales", m4294v = 2)
final class DictionaryRepositoryImpl$fetchAvailableLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15128a;

    /* JADX INFO: renamed from: b */
    public ArrayList f15129b;

    /* JADX INFO: renamed from: c */
    public Iterator f15130c;

    /* JADX INFO: renamed from: d */
    public int f15131d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15132e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1292h f15133f;

    /* JADX INFO: renamed from: g */
    public int f15134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$fetchAvailableLocales$1(C1292h c1292h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15133f = c1292h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15132e = obj;
        this.f15134g |= Integer.MIN_VALUE;
        return this.f15133f.m7198d(null, this);
    }
}
