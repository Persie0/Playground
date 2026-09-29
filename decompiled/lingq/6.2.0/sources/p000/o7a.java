package p000;

import com.lingq.core.domain.model.FeedTopic;

/* JADX INFO: loaded from: classes3.dex */
public final class o7a {

    /* JADX INFO: renamed from: a */
    public final FeedTopic f53956a;

    public o7a(FeedTopic feedTopic) {
        feedTopic.getClass();
        this.f53956a = feedTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7a) && this.f53956a == ((o7a) obj).f53956a;
    }

    public final int hashCode() {
        return this.f53956a.hashCode();
    }

    public final String toString() {
        return "OnTopicToggle(topic=" + this.f53956a + ")";
    }
}
