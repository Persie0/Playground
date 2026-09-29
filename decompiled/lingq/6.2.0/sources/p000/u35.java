package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u35 implements w35 {

    /* JADX INFO: renamed from: a */
    public final String f63348a;

    /* JADX INFO: renamed from: b */
    public final String f63349b;

    /* JADX INFO: renamed from: c */
    public final String f63350c;

    public u35(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f63348a = str;
        this.f63349b = str2;
        this.f63350c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u35)) {
            return false;
        }
        u35 u35Var = (u35) obj;
        return fa4.m11650l(this.f63348a, u35Var.f63348a) && fa4.m11650l(this.f63349b, u35Var.f63349b) && fa4.m11650l(this.f63350c, u35Var.f63350c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f63348a.hashCode() * 31, this.f63349b, 31);
        String str = this.f63350c;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("Loading(title=", this.f63348a, ", imageUrl=", this.f63349b, ", originalImageUrl="), this.f63350c, ")");
    }
}
