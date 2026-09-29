package com.lingq.core.domain.model.chat;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.enums.AbstractC3201a;
import p000.dn5;
import p000.on5;
import p000.vz1;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Gpt54' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class LynxChatModel {
    private static final /* synthetic */ ys2 $ENTRIES;
    private static final /* synthetic */ LynxChatModel[] $VALUES;
    public static final dn5 Companion;
    public static final LynxChatModel Gpt54;
    public static final LynxChatModel Gpt54Mini;
    public static final LynxChatModel Gpt54Nano;
    public static final LynxChatModel Gpt55;
    private final String displayName;

    /* JADX INFO: renamed from: id */
    private final String f18962id;
    private final List<LynxReasoningEffort> supportedEfforts;
    public static final LynxChatModel Gpt41Mini = new LynxChatModel("Gpt41Mini", 0, "openai/gpt-4.1-mini", "GPT-4.1 mini (default)", EmptyList.f47638a);
    public static final LynxChatModel Gpt5Mini = new LynxChatModel("Gpt5Mini", 1, "openai/gpt-5-mini", "GPT-5 mini (legacy)", vz1.m23605K(LynxReasoningEffort.Minimal, LynxReasoningEffort.Low, LynxReasoningEffort.Medium, LynxReasoningEffort.High));

    private static final /* synthetic */ LynxChatModel[] $values() {
        return new LynxChatModel[]{Gpt41Mini, Gpt5Mini, Gpt54, Gpt54Mini, Gpt54Nano, Gpt55};
    }

    static {
        List list = on5.f54615a;
        Gpt54 = new LynxChatModel("Gpt54", 2, "openai/gpt-5.4", "GPT-5.4", list);
        Gpt54Mini = new LynxChatModel("Gpt54Mini", 3, "openai/gpt-5.4-mini", "GPT-5.4 mini", list);
        Gpt54Nano = new LynxChatModel("Gpt54Nano", 4, "openai/gpt-5.4-nano", "GPT-5.4 nano", list);
        Gpt55 = new LynxChatModel("Gpt55", 5, "openai/gpt-5.5", "GPT-5.5", list);
        LynxChatModel[] lynxChatModelArr$values = $values();
        $VALUES = lynxChatModelArr$values;
        $ENTRIES = AbstractC3201a.m15404a(lynxChatModelArr$values);
        Companion = new dn5();
    }

    private LynxChatModel(String str, int i, String str2, String str3, List list) {
        super(str, i);
        this.f18962id = str2;
        this.displayName = str3;
        this.supportedEfforts = list;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static LynxChatModel valueOf(String str) {
        return (LynxChatModel) Enum.valueOf(LynxChatModel.class, str);
    }

    public static LynxChatModel[] values() {
        return (LynxChatModel[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.f18962id;
    }

    public final List<LynxReasoningEffort> getSupportedEfforts() {
        return this.supportedEfforts;
    }
}
