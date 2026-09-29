package p026b5;

import androidx.work.AbstractC1246d;
import androidx.work.OverwritingInputMerger;
import dm.C5207g;

/* JADX INFO: renamed from: b5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1315h extends AbstractC1318k {

    /* JADX INFO: renamed from: b5.h$a */
    public static final class a extends AbstractC1318k.a<a, C1315h> {
        public a(Class<? extends AbstractC1246d> cls) {
            super(cls);
            this.f8071c.f37527d = OverwritingInputMerger.class.getName();
        }

        @Override // p026b5.AbstractC1318k.a
        /* JADX INFO: renamed from: b */
        public final C1315h mo4874b() {
            if ((this.f8069a && this.f8071c.f37533j.f8048c) ? false : true) {
                return new C1315h(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }

        @Override // p026b5.AbstractC1318k.a
        /* JADX INFO: renamed from: c */
        public final a mo4875c() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315h(a aVar) {
        super(aVar.f8070b, aVar.f8071c, aVar.f8072d);
        C5207g.m11111f(aVar, "builder");
    }
}
