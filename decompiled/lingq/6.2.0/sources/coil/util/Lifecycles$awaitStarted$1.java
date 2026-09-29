package coil.util;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3572sf;
import p000.c32;

/* JADX INFO: renamed from: coil.util.-Lifecycles$awaitStarted$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.util.-Lifecycles", m4291f = "Lifecycles.kt", m4292l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m4293m = "awaitStarted")
final class Lifecycles$awaitStarted$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC3572sf f10572a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f10573b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10574c;

    /* JADX INFO: renamed from: d */
    public int f10575d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10574c = obj;
        this.f10575d |= Integer.MIN_VALUE;
        return AbstractC0865a.m4981a(null, this);
    }
}
