package jp;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C8778b;
import so.AbstractC9107y;

/* JADX INFO: renamed from: jp.n */
/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class C6546n extends InterfaceC6538f.a {

    /* JADX INFO: renamed from: a */
    public static final C6546n f37240a = new C6546n();

    /* JADX INFO: renamed from: jp.n$a */
    @IgnoreJRERequirement
    public static final class a<T> implements InterfaceC6538f<AbstractC9107y, Optional<T>> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6538f<AbstractC9107y, T> f37241a;

        public a(InterfaceC6538f<AbstractC9107y, T> interfaceC6538f) {
            this.f37241a = interfaceC6538f;
        }

        @Override // jp.InterfaceC6538f
        /* JADX INFO: renamed from: a */
        public final Object mo13122a(AbstractC9107y abstractC9107y) throws IOException {
            return Optional.ofNullable(this.f37241a.mo13122a(abstractC9107y));
        }
    }

    @Override // jp.InterfaceC6538f.a
    /* JADX INFO: renamed from: b */
    public final InterfaceC6538f<AbstractC9107y, ?> mo13121b(Type type, Annotation[] annotationArr, C6554v c6554v) {
        if (C8778b.m17027e(type) != Optional.class) {
            return null;
        }
        return new a(c6554v.m13154d(null, C8778b.m17026d(0, (ParameterizedType) type), annotationArr));
    }
}
