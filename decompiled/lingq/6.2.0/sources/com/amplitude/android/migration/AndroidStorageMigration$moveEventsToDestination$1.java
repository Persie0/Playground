package com.amplitude.android.migration;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b90;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.AndroidStorageMigration", m4291f = "AndroidStorageMigration.kt", m4292l = {21, 29, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m4293m = "moveEventsToDestination")
final class AndroidStorageMigration$moveEventsToDestination$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0891a f10869a;

    /* JADX INFO: renamed from: b */
    public Iterator f10870b;

    /* JADX INFO: renamed from: c */
    public String f10871c;

    /* JADX INFO: renamed from: d */
    public List f10872d;

    /* JADX INFO: renamed from: e */
    public Iterator f10873e;

    /* JADX INFO: renamed from: f */
    public b90 f10874f;

    /* JADX INFO: renamed from: g */
    public int f10875g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f10876h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0891a f10877i;

    /* JADX INFO: renamed from: j */
    public int f10878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageMigration$moveEventsToDestination$1(C0891a c0891a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10877i = c0891a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10876h = obj;
        this.f10878j |= Integer.MIN_VALUE;
        return this.f10877i.m5078b(this);
    }
}
