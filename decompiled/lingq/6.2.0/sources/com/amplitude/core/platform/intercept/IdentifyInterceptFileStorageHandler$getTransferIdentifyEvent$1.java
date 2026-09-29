package com.amplitude.core.platform.intercept;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b90;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler", m4291f = "IdentifyInterceptFileStorageHandler.kt", m4292l = {21, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "getTransferIdentifyEvent")
final class IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0908a f11111a;

    /* JADX INFO: renamed from: b */
    public b90 f11112b;

    /* JADX INFO: renamed from: c */
    public Map f11113c;

    /* JADX INFO: renamed from: d */
    public Iterator f11114d;

    /* JADX INFO: renamed from: e */
    public Object f11115e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f11116f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0908a f11117g;

    /* JADX INFO: renamed from: h */
    public int f11118h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptFileStorageHandler$getTransferIdentifyEvent$1(C0908a c0908a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11117g = c0908a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11116f = obj;
        this.f11118h |= Integer.MIN_VALUE;
        return this.f11117g.m5138b(this);
    }
}
