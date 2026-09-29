package com.lingq.shared.domain;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class Resource<T> {

    /* JADX INFO: renamed from: d */
    public static final C3303a f17861d = new C3303a();

    /* JADX INFO: renamed from: a */
    public final Status f17862a;

    /* JADX INFO: renamed from: b */
    public final T f17863b;

    /* JADX INFO: renamed from: c */
    public final Exception f17864c;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "EMPTY", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum Status {
        SUCCESS,
        ERROR,
        LOADING,
        EMPTY
    }

    /* JADX INFO: renamed from: com.lingq.shared.domain.Resource$a */
    public static final class C3303a {
        /* JADX INFO: renamed from: a */
        public static Resource m9435a(Exception exc, Object obj) {
            return new Resource(Status.ERROR, obj, exc);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Resource m9436b(C3303a c3303a, Exception exc) {
            c3303a.getClass();
            return m9435a(exc, null);
        }

        /* JADX INFO: renamed from: c */
        public static Resource m9437c(Object obj) {
            return new Resource(Status.SUCCESS, obj, null);
        }
    }

    public Resource(Status status, T t10, Exception exc) {
        C5207g.m11111f(status, "status");
        this.f17862a = status;
        this.f17863b = t10;
        this.f17864c = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        return this.f17862a == resource.f17862a && C5207g.m11106a(this.f17863b, resource.f17863b) && C5207g.m11106a(this.f17864c, resource.f17864c);
    }

    public final int hashCode() {
        int iHashCode = this.f17862a.hashCode() * 31;
        T t10 = this.f17863b;
        int iHashCode2 = (iHashCode + (t10 == null ? 0 : t10.hashCode())) * 31;
        Exception exc = this.f17864c;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "Resource(status=" + this.f17862a + ", data=" + this.f17863b + ", error=" + this.f17864c + ")";
    }
}
