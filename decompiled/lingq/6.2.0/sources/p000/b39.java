package p000;

import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class b39 extends c39 {

    /* JADX INFO: renamed from: e */
    public final ViewKeys f7876e;

    /* JADX INFO: renamed from: f */
    public final String f7877f;

    /* JADX INFO: renamed from: g */
    public final boolean f7878g;

    /* JADX INFO: renamed from: h */
    public final FeedTopic f7879h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b39(ViewKeys viewKeys, String str, boolean z, FeedTopic feedTopic) {
        super(viewKeys, "", str, z);
        viewKeys.getClass();
        this.f7876e = viewKeys;
        this.f7877f = str;
        this.f7878g = z;
        this.f7879h = feedTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b39)) {
            return false;
        }
        b39 b39Var = (b39) obj;
        return this.f7876e == b39Var.f7876e && this.f7877f.equals(b39Var.f7877f) && this.f7878g == b39Var.f7878g && this.f7879h == b39Var.f7879h;
    }

    public final int hashCode() {
        return this.f7879h.hashCode() + g9a.m12428e(ux5.m22980c(this.f7876e.hashCode() * 31, this.f7877f, 31), 31, this.f7878g);
    }

    public final String toString() {
        return "TopicSelection(selectionKey=" + this.f7876e + ", selectionValue=" + this.f7877f + ", selectionIsSelected=" + this.f7878g + ", topic=" + this.f7879h + ")";
    }
}
