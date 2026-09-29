package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ey8(with = w88.class)
public final class v88 {
    public static final u88 Companion = new u88();

    /* JADX INFO: renamed from: a */
    public final List f65025a;

    public v88(List list) {
        list.getClass();
        this.f65025a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m23175a() {
        return this.f65025a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v88) && fa4.m11650l(this.f65025a, ((v88) obj).f65025a);
    }

    public final int hashCode() {
        return this.f65025a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("ResultChatParagraph(sentences=", ")", this.f65025a);
    }
}
