package com.bumptech.glide.load.data;

import java.util.HashMap;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2099f {

    /* JADX INFO: renamed from: b */
    public static final a f10612b = new a();

    /* JADX INFO: renamed from: a */
    public final HashMap f10613a = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.f$a */
    public class a implements InterfaceC2098e.a<Object> {
        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: a */
        public final Class<Object> mo4885a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC2098e<Object> mo4886b(Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.f$b */
    public static final class b implements InterfaceC2098e<Object> {

        /* JADX INFO: renamed from: a */
        public final Object f10614a;

        public b(Object obj) {
            this.f10614a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e
        /* JADX INFO: renamed from: a */
        public final Object mo4883a() {
            return this.f10614a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2098e
        /* JADX INFO: renamed from: b */
        public final void mo4884b() {
        }
    }
}
