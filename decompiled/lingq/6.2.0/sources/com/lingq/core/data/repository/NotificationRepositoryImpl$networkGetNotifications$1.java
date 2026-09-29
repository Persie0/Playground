package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultNotifications;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.NotificationRepositoryImpl", m4291f = "NotificationRepositoryImpl.kt", m4292l = {56, 63, 68}, m4293m = "networkGetNotifications", m4294v = 2)
final class NotificationRepositoryImpl$networkGetNotifications$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15851a;

    /* JADX INFO: renamed from: b */
    public ResultNotifications f15852b;

    /* JADX INFO: renamed from: c */
    public ArrayList f15853c;

    /* JADX INFO: renamed from: d */
    public int f15854d;

    /* JADX INFO: renamed from: e */
    public int f15855e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15856f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1300p f15857g;

    /* JADX INFO: renamed from: h */
    public int f15858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepositoryImpl$networkGetNotifications$1(C1300p c1300p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15857g = c1300p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15856f = obj;
        this.f15858h |= Integer.MIN_VALUE;
        return this.f15857g.m7336c(0, null, this);
    }
}
