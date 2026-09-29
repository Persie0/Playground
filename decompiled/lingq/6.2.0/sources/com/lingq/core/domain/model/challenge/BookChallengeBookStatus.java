package com.lingq.core.domain.model.challenge;

import java.util.Set;
import kotlin.enums.AbstractC3201a;
import p000.AbstractC3550rv;
import p000.ee0;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.lingq.core.domain.model.challenge.BookChallengeBookStatus, still in use, count: 1, list:
  (r0v1 com.lingq.core.domain.model.challenge.BookChallengeBookStatus) from 0x004f: FILLED_NEW_ARRAY 
  (r0v1 com.lingq.core.domain.model.challenge.BookChallengeBookStatus)
  (r1v2 com.lingq.core.domain.model.challenge.BookChallengeBookStatus)
  (r2v3 com.lingq.core.domain.model.challenge.BookChallengeBookStatus)
 A[WRAPPED] elemType: com.lingq.core.domain.model.challenge.BookChallengeBookStatus
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class BookChallengeBookStatus {
    InProgress("P"),
    Completed("C"),
    Successful("S"),
    Failed("F"),
    Unknown("");

    private final String wireValue;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final ee0 Companion = new ee0();
    private static final Set<BookChallengeBookStatus> finished = AbstractC3550rv.m20855w0(new BookChallengeBookStatus[]{new BookChallengeBookStatus("C"), new BookChallengeBookStatus("S"), new BookChallengeBookStatus("F")});

    static {
    }

    private BookChallengeBookStatus(String str) {
        super(str, i);
        this.wireValue = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static BookChallengeBookStatus valueOf(String str) {
        return (BookChallengeBookStatus) Enum.valueOf(BookChallengeBookStatus.class, str);
    }

    public static BookChallengeBookStatus[] values() {
        return (BookChallengeBookStatus[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }
}
