package p000;

import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b95 extends h95 {

    /* JADX INFO: renamed from: b */
    public final List f8173b;

    /* JADX INFO: renamed from: c */
    public final String f8174c;

    /* JADX WARN: Illegal instructions before constructor call */
    public b95(List list) {
        EmbeddedMessageMetadata embeddedMessageMetadata;
        String str;
        EmbeddedMessage embeddedMessage = (EmbeddedMessage) u91.m22591I0(list);
        String strConcat = "embedded_".concat((embeddedMessage == null || (embeddedMessageMetadata = embeddedMessage.f14317a) == null || (str = embeddedMessageMetadata.f14333a) == null) ? "empty" : str);
        super(strConcat);
        this.f8173b = list;
        this.f8174c = strConcat;
    }

    @Override // p000.h95
    /* JADX INFO: renamed from: a */
    public final String mo188a() {
        return this.f8174c;
    }

    /* JADX INFO: renamed from: b */
    public final List m3492b() {
        return this.f8173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b95)) {
            return false;
        }
        b95 b95Var = (b95) obj;
        return fa4.m11650l(this.f8173b, b95Var.f8173b) && fa4.m11650l(this.f8174c, b95Var.f8174c);
    }

    public final int hashCode() {
        return this.f8174c.hashCode() + (this.f8173b.hashCode() * 31);
    }

    public final String toString() {
        return "Embedded(messages=" + this.f8173b + ", key=" + this.f8174c + ")";
    }
}
