package com.google.firebase.sessions;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.InstallationId$Companion", m4291f = "InstallationId.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "create")
final class InstallationId$Companion$create$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f13803a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f13804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1166b f13805c;

    /* JADX INFO: renamed from: d */
    public int f13806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(C1166b c1166b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13805c = c1166b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13804b = obj;
        this.f13806d |= Integer.MIN_VALUE;
        return this.f13805c.m6754a(null, this);
    }
}
