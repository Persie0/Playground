package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.w32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.serialization.json.internal.JsonTreeReader", m4291f = "JsonTreeReader.kt", m4292l = {22}, m4293m = "readObject", m4294v = 2)
final class JsonTreeReader$readObject$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public w32 f48246a;

    /* JADX INFO: renamed from: b */
    public C3266b f48247b;

    /* JADX INFO: renamed from: c */
    public LinkedHashMap f48248c;

    /* JADX INFO: renamed from: d */
    public String f48249d;

    /* JADX INFO: renamed from: e */
    public int f48250e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f48251f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3266b f48252g;

    /* JADX INFO: renamed from: h */
    public int f48253h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(C3266b c3266b, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.f48252g = c3266b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48251f = obj;
        this.f48253h |= Integer.MIN_VALUE;
        return C3266b.m15623a(this.f48252g, null, this);
    }
}
