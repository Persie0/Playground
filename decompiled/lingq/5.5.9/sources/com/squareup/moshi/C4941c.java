package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: renamed from: com.squareup.moshi.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4941c extends C4939a.b {

    /* JADX INFO: renamed from: h */
    public AbstractC4949k<Object> f32225h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Type[] f32226i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Type f32227j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Set f32228k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Set f32229l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4941c(Type type, Set set, Object obj, Method method, int i10, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i10, 1, z10);
        this.f32226i = typeArr;
        this.f32227j = type2;
        this.f32228k = set2;
        this.f32229l = set3;
    }

    @Override // com.squareup.moshi.C4939a.b
    /* JADX INFO: renamed from: a */
    public final void mo10525a(C4955q c4955q, AbstractC4949k.a aVar) {
        super.mo10525a(c4955q, aVar);
        Type type = this.f32226i[0];
        Type type2 = this.f32227j;
        boolean zM17657b = C9312p.m17657b(type, type2);
        Set<? extends Annotation> set = this.f32229l;
        this.f32225h = (zM17657b && this.f32228k.equals(set)) ? c4955q.m10566d(aVar, type2, set) : c4955q.m10565c(type2, set, null);
    }

    @Override // com.squareup.moshi.C4939a.b
    /* JADX INFO: renamed from: d */
    public final void mo10528d(AbstractC9310n abstractC9310n, Object obj) throws IOException, InvocationTargetException {
        this.f32225h.mo9386f(abstractC9310n, m10527c(obj));
    }
}
