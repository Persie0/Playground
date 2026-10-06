package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nfi extends nfa implements Serializable {

    /* JADX INFO: renamed from: a */
    private final MessageDigest f42178a;

    /* JADX INFO: renamed from: b */
    private final int f42179b;

    /* JADX INFO: renamed from: c */
    private final boolean f42180c;

    /* JADX INFO: renamed from: d */
    private final String f42181d;

    public nfi(String str, int i) {
        this.f42181d = "Hashing.sha256()";
        MessageDigest messageDigestM17444b = m17444b(str);
        this.f42178a = messageDigestM17444b;
        int digestLength = messageDigestM17444b.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        lku.m15608C(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.f42179b = i;
        this.f42180c = m17445c(messageDigestM17444b);
    }

    /* JADX INFO: renamed from: b */
    private static MessageDigest m17444b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m17445c(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.nfd
    /* JADX INFO: renamed from: a */
    public final nea mo17442a() {
        if (this.f42180c) {
            try {
                return new nfg((MessageDigest) this.f42178a.clone(), this.f42179b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new nfg(m17444b(this.f42178a.getAlgorithm()), this.f42179b);
    }

    public final String toString() {
        return this.f42181d;
    }

    Object writeReplace() {
        return new nfh(this.f42178a.getAlgorithm(), this.f42179b);
    }

    public nfi() {
        MessageDigest messageDigestM17444b = m17444b("SHA-256");
        this.f42178a = messageDigestM17444b;
        this.f42179b = messageDigestM17444b.getDigestLength();
        this.f42181d = "Hashing.sha256()";
        this.f42180c = m17445c(messageDigestM17444b);
    }
}
