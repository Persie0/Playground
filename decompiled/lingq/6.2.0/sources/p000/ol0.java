package p000;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class ol0 {

    /* JADX INFO: renamed from: a */
    public final long f54520a;

    /* JADX INFO: renamed from: b */
    public final DateTimeZone f54521b;

    /* JADX INFO: renamed from: c */
    public ol0 f54522c;

    /* JADX INFO: renamed from: d */
    public String f54523d;

    /* JADX INFO: renamed from: e */
    public int f54524e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public int f54525f = Integer.MIN_VALUE;

    public ol0(DateTimeZone dateTimeZone, long j) {
        this.f54520a = j;
        this.f54521b = dateTimeZone;
    }

    /* JADX INFO: renamed from: a */
    public final String m18093a(long j) {
        ol0 ol0Var = this.f54522c;
        if (ol0Var != null && j >= ol0Var.f54520a) {
            return ol0Var.m18093a(j);
        }
        if (this.f54523d == null) {
            this.f54523d = this.f54521b.mo18350i(this.f54520a);
        }
        return this.f54523d;
    }

    /* JADX INFO: renamed from: b */
    public final int m18094b(long j) {
        ol0 ol0Var = this.f54522c;
        if (ol0Var != null && j >= ol0Var.f54520a) {
            return ol0Var.m18094b(j);
        }
        if (this.f54524e == Integer.MIN_VALUE) {
            this.f54524e = this.f54521b.mo18351k(this.f54520a);
        }
        return this.f54524e;
    }

    /* JADX INFO: renamed from: c */
    public final int m18095c(long j) {
        ol0 ol0Var = this.f54522c;
        if (ol0Var != null && j >= ol0Var.f54520a) {
            return ol0Var.m18095c(j);
        }
        if (this.f54525f == Integer.MIN_VALUE) {
            this.f54525f = this.f54521b.mo18354o(this.f54520a);
        }
        return this.f54525f;
    }
}
