package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Participant {
    public static final C1696n Companion = new C1696n();

    /* JADX INFO: renamed from: a */
    public final Extra f20569a;

    /* JADX INFO: renamed from: b */
    public final ParticipantStat f20570b;

    /* JADX INFO: renamed from: c */
    public final Integer f20571c;

    /* JADX INFO: renamed from: d */
    public final String f20572d;

    public /* synthetic */ Participant(int i, Extra extra, ParticipantStat participantStat, Integer num, String str) {
        this.f20569a = (i & 1) == 0 ? new Extra() : extra;
        if ((i & 2) == 0) {
            this.f20570b = new ParticipantStat();
        } else {
            this.f20570b = participantStat;
        }
        if ((i & 4) == 0) {
            this.f20571c = null;
        } else {
            this.f20571c = num;
        }
        if ((i & 8) == 0) {
            this.f20572d = null;
        } else {
            this.f20572d = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Extra m8306a() {
        return this.f20569a;
    }

    /* JADX INFO: renamed from: b */
    public final ParticipantStat m8307b() {
        return this.f20570b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) obj;
        return fa4.m11650l(this.f20569a, participant.f20569a) && fa4.m11650l(this.f20570b, participant.f20570b) && fa4.m11650l(this.f20571c, participant.f20571c) && fa4.m11650l(this.f20572d, participant.f20572d);
    }

    public final int hashCode() {
        Extra extra = this.f20569a;
        int iHashCode = (extra == null ? 0 : extra.hashCode()) * 31;
        ParticipantStat participantStat = this.f20570b;
        int iHashCode2 = (iHashCode + (participantStat == null ? 0 : participantStat.hashCode())) * 31;
        Integer num = this.f20571c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f20572d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Participant(extra=" + this.f20569a + ", stats=" + this.f20570b + ", rank=" + this.f20571c + ", status=" + this.f20572d + ")";
    }
}
