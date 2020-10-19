/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.jsonDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.jsonDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonDslFactoryImpl extends EFactoryImpl implements JsonDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonDslFactory init()
  {
    try
    {
      JsonDslFactory theJsonDslFactory = (JsonDslFactory)EPackage.Registry.INSTANCE.getEFactory(JsonDslPackage.eNS_URI);
      if (theJsonDslFactory != null)
      {
        return theJsonDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JsonDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JsonDslPackage.MODEL: return createModel();
      case JsonDslPackage.SIMPLE_STATEMENT: return createSimpleStatement();
      case JsonDslPackage.ASSIGNMENT: return createAssignment();
      case JsonDslPackage.EXPRESSION: return createExpression();
      case JsonDslPackage.UNARY_MINUS_EXPRESSION: return createUnaryMinusExpression();
      case JsonDslPackage.UNARY_PLUS_EXPRESSION: return createUnaryPlusExpression();
      case JsonDslPackage.LOGICAL_NEGATION_EXPRESSION: return createLogicalNegationExpression();
      case JsonDslPackage.BRACKET_EXPRESSION: return createBracketExpression();
      case JsonDslPackage.VARIABLE_CALL: return createVariableCall();
      case JsonDslPackage.AUXILIAR_CALLER: return createAuxiliarCaller();
      case JsonDslPackage.FIELD_CALLER: return createFieldCaller();
      case JsonDslPackage.ARRAY_CALLER: return createArrayCaller();
      case JsonDslPackage.IO_FUNCTIONS: return createIOFunctions();
      case JsonDslPackage.INFO_FUNCTIONS: return createInfoFunctions();
      case JsonDslPackage.MANIP_FUNCTIONS: return createManipFunctions();
      case JsonDslPackage.ARITH_FUNCTIONS: return createArithFunctions();
      case JsonDslPackage.ALTER_FUNCTIONS: return createAlterFunctions();
      case JsonDslPackage.LOAD: return createLoad();
      case JsonDslPackage.STORE: return createStore();
      case JsonDslPackage.EXPORT: return createExport();
      case JsonDslPackage.PROC_CALL: return createProcCall();
      case JsonDslPackage.DEPTH: return createDepth();
      case JsonDslPackage.FIELD_INFO: return createFieldInfo();
      case JsonDslPackage.CONTAINS: return createContains();
      case JsonDslPackage.SELECT: return createSelect();
      case JsonDslPackage.CONCAT: return createConcat();
      case JsonDslPackage.SUM: return createSum();
      case JsonDslPackage.PRODUCT: return createProduct();
      case JsonDslPackage.MEAN: return createMean();
      case JsonDslPackage.ADD: return createAdd();
      case JsonDslPackage.INSERT: return createInsert();
      case JsonDslPackage.RENAME: return createRename();
      case JsonDslPackage.DELETE: return createDelete();
      case JsonDslPackage.REMOVE: return createRemove();
      case JsonDslPackage.CONSTANT: return createConstant();
      case JsonDslPackage.PRIMITIVE: return createPrimitive();
      case JsonDslPackage.ARRAY: return createArray();
      case JsonDslPackage.JSON_OBJECT: return createJSonObject();
      case JsonDslPackage.FIELD: return createField();
      case JsonDslPackage.DISJUNCTION_EXPRESSION: return createDisjunctionExpression();
      case JsonDslPackage.CONJUNCTION_EXPRESSION: return createConjunctionExpression();
      case JsonDslPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case JsonDslPackage.INEQUALITY_EXPRESSION: return createInequalityExpression();
      case JsonDslPackage.SUPERI_EXPRESSION: return createSuperiExpression();
      case JsonDslPackage.SUPERIOR_OR_EQUAL_EXPRESSION: return createSuperiorOrEqualExpression();
      case JsonDslPackage.INFERI_EXPRESSION: return createInferiExpression();
      case JsonDslPackage.INFERIOR_OR_EQUAL_EXPRESSION: return createInferiorOrEqualExpression();
      case JsonDslPackage.ADDITION_EXPRESSION: return createAdditionExpression();
      case JsonDslPackage.SUBSTRACTION_EXPRESSION: return createSubstractionExpression();
      case JsonDslPackage.MULTIPLICATION_EXPRESSION: return createMultiplicationExpression();
      case JsonDslPackage.DIVISION_EXPRESSION: return createDivisionExpression();
      case JsonDslPackage.MODULO_EXPRESSION: return createModuloExpression();
      case JsonDslPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleStatement createSimpleStatement()
  {
    SimpleStatementImpl simpleStatement = new SimpleStatementImpl();
    return simpleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryMinusExpression createUnaryMinusExpression()
  {
    UnaryMinusExpressionImpl unaryMinusExpression = new UnaryMinusExpressionImpl();
    return unaryMinusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryPlusExpression createUnaryPlusExpression()
  {
    UnaryPlusExpressionImpl unaryPlusExpression = new UnaryPlusExpressionImpl();
    return unaryPlusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalNegationExpression createLogicalNegationExpression()
  {
    LogicalNegationExpressionImpl logicalNegationExpression = new LogicalNegationExpressionImpl();
    return logicalNegationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BracketExpression createBracketExpression()
  {
    BracketExpressionImpl bracketExpression = new BracketExpressionImpl();
    return bracketExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableCall createVariableCall()
  {
    VariableCallImpl variableCall = new VariableCallImpl();
    return variableCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AuxiliarCaller createAuxiliarCaller()
  {
    AuxiliarCallerImpl auxiliarCaller = new AuxiliarCallerImpl();
    return auxiliarCaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldCaller createFieldCaller()
  {
    FieldCallerImpl fieldCaller = new FieldCallerImpl();
    return fieldCaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayCaller createArrayCaller()
  {
    ArrayCallerImpl arrayCaller = new ArrayCallerImpl();
    return arrayCaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IOFunctions createIOFunctions()
  {
    IOFunctionsImpl ioFunctions = new IOFunctionsImpl();
    return ioFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfoFunctions createInfoFunctions()
  {
    InfoFunctionsImpl infoFunctions = new InfoFunctionsImpl();
    return infoFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ManipFunctions createManipFunctions()
  {
    ManipFunctionsImpl manipFunctions = new ManipFunctionsImpl();
    return manipFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithFunctions createArithFunctions()
  {
    ArithFunctionsImpl arithFunctions = new ArithFunctionsImpl();
    return arithFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlterFunctions createAlterFunctions()
  {
    AlterFunctionsImpl alterFunctions = new AlterFunctionsImpl();
    return alterFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProcCall createProcCall()
  {
    ProcCallImpl procCall = new ProcCallImpl();
    return procCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Depth createDepth()
  {
    DepthImpl depth = new DepthImpl();
    return depth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldInfo createFieldInfo()
  {
    FieldInfoImpl fieldInfo = new FieldInfoImpl();
    return fieldInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contains createContains()
  {
    ContainsImpl contains = new ContainsImpl();
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Concat createConcat()
  {
    ConcatImpl concat = new ConcatImpl();
    return concat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum createSum()
  {
    SumImpl sum = new SumImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Product createProduct()
  {
    ProductImpl product = new ProductImpl();
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mean createMean()
  {
    MeanImpl mean = new MeanImpl();
    return mean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Insert createInsert()
  {
    InsertImpl insert = new InsertImpl();
    return insert;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rename createRename()
  {
    RenameImpl rename = new RenameImpl();
    return rename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Delete createDelete()
  {
    DeleteImpl delete = new DeleteImpl();
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Remove createRemove()
  {
    RemoveImpl remove = new RemoveImpl();
    return remove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JSonObject createJSonObject()
  {
    JSonObjectImpl jSonObject = new JSonObjectImpl();
    return jSonObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DisjunctionExpression createDisjunctionExpression()
  {
    DisjunctionExpressionImpl disjunctionExpression = new DisjunctionExpressionImpl();
    return disjunctionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConjunctionExpression createConjunctionExpression()
  {
    ConjunctionExpressionImpl conjunctionExpression = new ConjunctionExpressionImpl();
    return conjunctionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InequalityExpression createInequalityExpression()
  {
    InequalityExpressionImpl inequalityExpression = new InequalityExpressionImpl();
    return inequalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SuperiExpression createSuperiExpression()
  {
    SuperiExpressionImpl superiExpression = new SuperiExpressionImpl();
    return superiExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SuperiorOrEqualExpression createSuperiorOrEqualExpression()
  {
    SuperiorOrEqualExpressionImpl superiorOrEqualExpression = new SuperiorOrEqualExpressionImpl();
    return superiorOrEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InferiExpression createInferiExpression()
  {
    InferiExpressionImpl inferiExpression = new InferiExpressionImpl();
    return inferiExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InferiorOrEqualExpression createInferiorOrEqualExpression()
  {
    InferiorOrEqualExpressionImpl inferiorOrEqualExpression = new InferiorOrEqualExpressionImpl();
    return inferiorOrEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditionExpression createAdditionExpression()
  {
    AdditionExpressionImpl additionExpression = new AdditionExpressionImpl();
    return additionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubstractionExpression createSubstractionExpression()
  {
    SubstractionExpressionImpl substractionExpression = new SubstractionExpressionImpl();
    return substractionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplicationExpression createMultiplicationExpression()
  {
    MultiplicationExpressionImpl multiplicationExpression = new MultiplicationExpressionImpl();
    return multiplicationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DivisionExpression createDivisionExpression()
  {
    DivisionExpressionImpl divisionExpression = new DivisionExpressionImpl();
    return divisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuloExpression createModuloExpression()
  {
    ModuloExpressionImpl moduloExpression = new ModuloExpressionImpl();
    return moduloExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonDslPackage getJsonDslPackage()
  {
    return (JsonDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JsonDslPackage getPackage()
  {
    return JsonDslPackage.eINSTANCE;
  }

} //JsonDslFactoryImpl
