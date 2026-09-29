package kp;

import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import jp.C6554v;
import jp.InterfaceC6538f;
import so.AbstractC9107y;
import tk.C9304h;
import tk.C9305i;
import tk.C9306j;
import tk.InterfaceC9308l;

/* JADX INFO: renamed from: kp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7199a extends InterfaceC6538f.a {

    /* JADX INFO: renamed from: a */
    public final C4955q f40522a;

    /* JADX INFO: renamed from: b */
    public final boolean f40523b = false;

    /* JADX INFO: renamed from: c */
    public final boolean f40524c = false;

    /* JADX INFO: renamed from: d */
    public final boolean f40525d = false;

    public C7199a(C4955q c4955q) {
        this.f40522a = c4955q;
    }

    /* JADX INFO: renamed from: c */
    public static Set<? extends Annotation> m14514c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC9308l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // jp.InterfaceC6538f.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC6538f mo13120a(Type type, Annotation[] annotationArr) {
        AbstractC4949k abstractC4949kM10565c = this.f40522a.m10565c(type, m14514c(annotationArr), null);
        if (this.f40523b) {
            abstractC4949kM10565c = new C9305i(abstractC4949kM10565c);
        }
        if (this.f40524c) {
            abstractC4949kM10565c = new C9306j(abstractC4949kM10565c);
        }
        if (this.f40525d) {
            abstractC4949kM10565c = new C9304h(abstractC4949kM10565c);
        }
        return new C7200b(abstractC4949kM10565c);
    }

    @Override // jp.InterfaceC6538f.a
    /* JADX INFO: renamed from: b */
    public final InterfaceC6538f<AbstractC9107y, ?> mo13121b(Type type, Annotation[] annotationArr, C6554v c6554v) {
        AbstractC4949k abstractC4949kM10565c = this.f40522a.m10565c(type, m14514c(annotationArr), null);
        if (this.f40523b) {
            abstractC4949kM10565c = new C9305i(abstractC4949kM10565c);
        }
        if (this.f40524c) {
            abstractC4949kM10565c = new C9306j(abstractC4949kM10565c);
        }
        if (this.f40525d) {
            abstractC4949kM10565c = new C9304h(abstractC4949kM10565c);
        }
        return new C7201c(abstractC4949kM10565c);
    }
}
