package p000;

import com.lingq.core.domain.stats.ActivityScore;

/* JADX INFO: loaded from: classes2.dex */
public final class c4b extends d4b {

    /* JADX INFO: renamed from: a */
    public final int f9491a;

    /* JADX INFO: renamed from: b */
    public final int f9492b;

    /* JADX INFO: renamed from: c */
    public final ActivityScore f9493c;

    /* JADX INFO: renamed from: d */
    public final double f9494d;

    /* JADX INFO: renamed from: e */
    public final double f9495e;

    /* JADX INFO: renamed from: f */
    public final ActivityScore f9496f;

    /* JADX INFO: renamed from: g */
    public final int f9497g;

    /* JADX INFO: renamed from: h */
    public final int f9498h;

    /* JADX INFO: renamed from: i */
    public final ActivityScore f9499i;

    public c4b(int i, int i2, ActivityScore activityScore, double d, double d2, ActivityScore activityScore2, int i3, int i4, ActivityScore activityScore3) {
        activityScore.getClass();
        activityScore2.getClass();
        activityScore3.getClass();
        this.f9491a = i;
        this.f9492b = i2;
        this.f9493c = activityScore;
        this.f9494d = d;
        this.f9495e = d2;
        this.f9496f = activityScore2;
        this.f9497g = i3;
        this.f9498h = i4;
        this.f9499i = activityScore3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4b)) {
            return false;
        }
        c4b c4bVar = (c4b) obj;
        return this.f9491a == c4bVar.f9491a && this.f9492b == c4bVar.f9492b && this.f9493c == c4bVar.f9493c && Double.compare(this.f9494d, c4bVar.f9494d) == 0 && Double.compare(this.f9495e, c4bVar.f9495e) == 0 && this.f9496f == c4bVar.f9496f && this.f9497g == c4bVar.f9497g && this.f9498h == c4bVar.f9498h && this.f9499i == c4bVar.f9499i;
    }

    public final int hashCode() {
        return this.f9499i.hashCode() + wq1.m24106b(this.f9498h, wq1.m24106b(this.f9497g, (this.f9496f.hashCode() + g9a.m12424a(this.f9495e, g9a.m12424a(this.f9494d, (this.f9493c.hashCode() + wq1.m24106b(this.f9492b, Integer.hashCode(this.f9491a) * 31, 31)) * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f9491a, this.f9492b, "Success(wordsReading=", ", wordsReadingGoal=", ", wordsReadingScore=");
        sbM22994q.append(this.f9493c);
        sbM22994q.append(", hoursListening=");
        sbM22994q.append(this.f9494d);
        hn1.m13370t(sbM22994q, ", hoursListeningGoal=", this.f9495e, ", hoursListeningScore=");
        sbM22994q.append(this.f9496f);
        sbM22994q.append(", lingqsCreated=");
        sbM22994q.append(this.f9497g);
        sbM22994q.append(", lingqsCreatedGoal=");
        sbM22994q.append(this.f9498h);
        sbM22994q.append(", lingqsCreatedScore=");
        sbM22994q.append(this.f9499i);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
