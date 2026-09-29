package com.lingq.p055ui.home.vocabulary;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4033e {

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.e$a */
    public static final class a extends AbstractC4033e {

        /* JADX INFO: renamed from: a */
        public static final a f26343a = new a();
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.e$b */
    public static final class b extends AbstractC4033e {

        /* JADX INFO: renamed from: a */
        public final List<String> f26344a;

        public b(ArrayList arrayList) {
            this.f26344a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && C5207g.m11106a(this.f26344a, ((b) obj).f26344a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f26344a.hashCode();
        }

        public final String toString() {
            return "NavigateReview(data=" + this.f26344a + ")";
        }
    }
}
