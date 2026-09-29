package p543do;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: do.q0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5252q0 {

    /* JADX INFO: renamed from: a */
    public static final a f33344a = new a();

    /* JADX INFO: renamed from: do.q0$a */
    public static final class a extends AbstractC5252q0 {
        @Override // p543do.AbstractC5252q0
        /* JADX INFO: renamed from: d */
        public final InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t) {
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11274a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo11282b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC9077e mo11275c(InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(interfaceC9077e, "annotations");
        return interfaceC9077e;
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t);

    /* JADX INFO: renamed from: e */
    public boolean mo11276e() {
        return this instanceof a;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC5257t mo11277f(AbstractC5257t abstractC5257t, Variance variance) {
        C5207g.m11111f(abstractC5257t, "topLevelType");
        C5207g.m11111f(variance, "position");
        return abstractC5257t;
    }
}
