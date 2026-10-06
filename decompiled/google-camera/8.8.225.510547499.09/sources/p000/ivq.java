package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ivq {
    BADGE("badge"),
    EDIT("edit"),
    INTERACT("interact"),
    LAUNCH("launch");


    /* JADX INFO: renamed from: f */
    private static final Set f32306f;

    /* JADX INFO: renamed from: e */
    public final String f32308e;

    static {
        ivq ivqVar = BADGE;
        ivq ivqVar2 = EDIT;
        ivq ivqVar3 = INTERACT;
        ivq ivqVar4 = LAUNCH;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ivqVar.f32308e, ivqVar2.f32308e, ivqVar3.f32308e)));
        f32306f = setUnmodifiableSet;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        hashSet.add(ivqVar4.f32308e);
        Collections.unmodifiableSet(hashSet);
    }

    ivq(String str) {
        this.f32308e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32308e;
    }
}
