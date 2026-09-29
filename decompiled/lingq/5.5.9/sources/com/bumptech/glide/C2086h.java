package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bumptech.glide.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2086h {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, Object> f10568a;

    /* JADX INFO: renamed from: com.bumptech.glide.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final HashMap f10569a = new HashMap();
    }

    public C2086h(a aVar) {
        this.f10568a = Collections.unmodifiableMap(new HashMap(aVar.f10569a));
    }
}
