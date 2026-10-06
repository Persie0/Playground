package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bud implements cbl {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4475a;

    public bud(int i) {
        this.f4475a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final bue m3075b() {
        try {
            return new bue(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.cbl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2998a() {
        switch (this.f4475a) {
            case 0:
                return m3075b();
            case 1:
                return new bsy();
            default:
                return new ArrayList();
        }
    }
}
