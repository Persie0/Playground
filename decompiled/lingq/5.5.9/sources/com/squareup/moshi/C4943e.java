package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import tk.C9312p;

/* JADX INFO: renamed from: com.squareup.moshi.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C4943e extends C4939a.b {

    /* JADX INFO: renamed from: h */
    public AbstractC4949k<Object> f32230h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Type[] f32231i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Type f32232j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Set f32233k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Set f32234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4943e(Type type, Set set, Object obj, Method method, int i10, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i10, 1, z10);
        this.f32231i = typeArr;
        this.f32232j = type2;
        this.f32233k = set2;
        this.f32234l = set3;
    }

    @Override // com.squareup.moshi.C4939a.b
    /* JADX INFO: renamed from: a */
    public final void mo10525a(C4955q c4955q, AbstractC4949k.a aVar) {
        super.mo10525a(c4955q, aVar);
        Type[] typeArr = this.f32231i;
        boolean zM17657b = C9312p.m17657b(typeArr[0], this.f32232j);
        Set<? extends Annotation> set = this.f32233k;
        this.f32230h = (zM17657b && set.equals(this.f32234l)) ? c4955q.m10566d(aVar, typeArr[0], set) : c4955q.m10565c(typeArr[0], set, null);
    }

    @Override // com.squareup.moshi.C4939a.b
    /* JADX INFO: renamed from: b */
    public final Object mo10526b(JsonReader jsonReader) throws IOException, InvocationTargetException {
        return m10527c(this.f32230h.mo9385a(jsonReader));
    }
}
