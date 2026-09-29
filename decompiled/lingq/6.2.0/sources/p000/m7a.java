package p000;

import com.lingq.core.domain.model.FeedTopic;

/* JADX INFO: loaded from: classes3.dex */
public final class m7a {

    /* JADX INFO: renamed from: a */
    public final FeedTopic f50736a;

    /* JADX INFO: renamed from: b */
    public final boolean f50737b;

    public m7a(FeedTopic feedTopic, boolean z) {
        feedTopic.getClass();
        this.f50736a = feedTopic;
        this.f50737b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7a)) {
            return false;
        }
        m7a m7aVar = (m7a) obj;
        return this.f50736a == m7aVar.f50736a && this.f50737b == m7aVar.f50737b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50737b) + (this.f50736a.hashCode() * 31);
    }

    public final String toString() {
        return "TopicItem(topic=" + this.f50736a + ", isSelected=" + this.f50737b + ")";
    }
}
